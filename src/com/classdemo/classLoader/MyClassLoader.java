package com.classdemo.classLoader;

import java.io.*;

/**
 * Created by jibingbing on 2017/12/14.
 */
public class MyClassLoader extends ClassLoader {
    private String name;
    private String path;

    private final String fileType = ".class";

    public MyClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    public MyClassLoader(String name) {
        super();
        this.name = name;
    }

    public String toString(String name){
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    protected Class findClass(String name) throws ClassNotFoundException{
        byte[] data = loadClassData(name);
        return defineClass(name,data,0,data.length);
    }

    private byte[] loadClassData(String name) throws ClassNotFoundException{
        FileInputStream fis = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            //把com.classdemo.xxx这种类型的文件名替换成com/classdemo/xxx路径
            name = name.replaceAll("\\.","\\/");
            fis = new FileInputStream(new File(path + "/" + name + fileType));
            baos = new ByteArrayOutputStream();

            int ch = 0;
            while ((ch = fis.read()) != -1) {
                baos.write(ch);
            }
            data = baos.toByteArray();

            fis.close();
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) throws Exception{
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("/Users/jibingbing/IdeaProjects/ClassDemo/out/production/ClassDemo");
        MyClassLoader loader2 = new MyClassLoader(loader1,"loader2");
        loader2.setPath("/Users/jibingbing/IdeaProjects/ClassDemo/out/production/ClassDemo");
        MyClassLoader loader3 = new MyClassLoader(null,"loader3");
        loader3.setPath("/Users/jibingbing/IdeaProjects/ClassDemo/out/production/ClassDemo");

        test(loader2);
        test(loader3);
    }

    public static void test(ClassLoader loader) throws Exception{
        Class objClass = loader.loadClass("com.classdemo.classLoader.Sample");
        Object obj = objClass.newInstance();
//        System.out.println(obj);
    }
}
