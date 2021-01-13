import haber.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import haber.Abstract.Haber;
import javassist.tools.reflect.Reflection;
import org.reflections.*;



import haber.Milliyet.*;

public class NewsProgram {
    private JComboBox comboBox1;
    private JList list1;
    private JTextArea textArea1;
    private JPanel panel;

    public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        JFrame frame = new JFrame("News");
        frame.setContentPane(new NewsProgram().panel);
        frame.setVisible(true);


        }







    public NewsProgram() throws
            IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<String> classNames = new ArrayList();

        ZipInputStream zip = new ZipInputStream(new FileInputStream("C:/news/Haberler.jar"));
        for(ZipEntry entry = zip.getNextEntry(); entry!=null; entry= zip.getNextEntry()){
            if(!entry.isDirectory()&&entry.getName().endsWith(".class")&& entry.getName().startsWith("haber")&& !entry.getName().startsWith("haber/Abstract")){
                String className = entry.getName().replace('/','.');
                classNames.add(className.substring(0,className.length()-".class".length()));

                //  program.comboBox1.addItem((className.substring(0,className.length())-".class".length()));
            }

        }
        for (String s:classNames)
            comboBox1.addItem(s.toString().substring(6));
        classNames.forEach(className->{
            List<Object> list = new ArrayList<>();
            try {
                Class<?> clz = Class.forName(className);

                Method method = clz.getDeclaredMethod("getEntry");
                Object obj = clz.getConstructor().newInstance();
                method.invoke(obj);
                list.add(obj.getClass().getConstructors();
                System.out.println(list);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });


      /*  Collection<Class<?>> classes = new ArrayList<Class<?>>();
        ArrayList<String> getname = new ArrayList<String>();
        Cnn cnn = new Cnn();
        Milliyet milli = new Milliyet();
        Ntv ntv = new Ntv();

        JarFile jar = new JarFile("C:\\news\\Haberler.jar");
        for (Enumeration<JarEntry> entries = jar.entries(); entries.hasMoreElements(); ) {
            JarEntry entry = entries.nextElement();
            String file = entry.getName();
            if (file.endsWith(".class")) {
                String classname = file.replace('/', '.').substring(0, file.length() - 6);
                try {
                    Class<?> c = Class.forName(classname);

                    if (c.getPackageName().equals("haber")) {
                        classes.add(c);
                    }
                } catch (Throwable e) {
                    System.out.println("WARNING: failed to instantiate " + classname + " from " + file);
                }
            }
        }

        comboBox1.addItem("Haber Sitesini Seçiniz");
        for (Class<?> a : classes) {
            comboBox1.addItem(a.toString().substring(12));


        }

    /*    comboBox1.addItem("Haber Sitesini Seçiniz");
        Reflections reflection = new Reflections("haber");
        Set<Class<? extends Haber>> allClasses =
                reflection.getSubTypesOf(Haber.class);
        for (Class<? extends Haber> subClass : allClasses) {
            try {
                comboBox1.addItem(subClass.getConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object object = comboBox1.getSelectedItem();
                if (object.equals("Cnn")) {
                    DefaultListModel<String> model = new DefaultListModel<String>();


                    for (String comboboxSelect : cnn.title) {
                        model.addElement(comboboxSelect);
                    }
                    list1.setModel(model);


                } else if (object.equals(milli.getName())) {
                    DefaultListModel<String> model = new DefaultListModel<String>();

                    for (String comboboxSelect : milli.title) {
                        model.addElement(comboboxSelect);
                    }
                    list1.setModel(model);
                } else if (object.equals("Ntv")) {
                    DefaultListModel<String> model = new DefaultListModel<String>();
                    for (String comboboxSelect : ntv.title) {
                        model.addElement(comboboxSelect);
                    }
                    list1.setModel(model);
                } else {
                    DefaultListModel<String> model = new DefaultListModel<String>();
                    textArea1.setText("Seçim Yapın");
                    list1.setModel(model);
                }
            }
        });

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object object = comboBox1.getSelectedItem();

                if (object.equals("Cnn")) {
                    int list1select = list1.getSelectedIndex();


                    textArea1.setText(cnn.Description.get(list1select));
                } else if (object.equals("Ntv")) {
                    int list1select = list1.getSelectedIndex();


                    textArea1.setText(ntv.Description.get(list1select));
                } else if (object.equals(milli.getName())) {
                    int list1select = list1.getSelectedIndex();


                    textArea1.setText(milli.Description.get(list1select));
                } else {
                    textArea1.setText("");
                }
            }
        });
    }
*/
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }}




