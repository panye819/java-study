package section85_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetElementsDemo {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("section85_reflect.Person2");
		Class<?> inter[]  = c.getInterfaces();
		for(int i=0;i<inter.length;i++) {
			System.out.println(inter[i].getName());
		}
		Constructor<?> con[] = c.getConstructors();
		for(int i=0;i<con.length;i++) {
			//直接通过getName()方法取得，只能取得构造方法的名字，而访问权限和参数都完全不显示
			//这时候取得的权限修饰符都是数字
			int mod = con[i].getModifiers();
		    //将mod转换成字符串修饰符
			String str = Modifier.toString(mod);
			
			Class<?> param[] = con[i].getParameterTypes();
			System.out.print(str+" ");
			System.out.print(con[i].getName()+" ( ");
			for(int x=0;x<param.length;x++) {
				System.out.print(param[x].getName()+" arg-"+x);
				if(x<param.length-1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
		}
		System.out.println("---开始获取类中的所有方法---");
		Method[] met = c.getMethods();
		for(int x=0;x<met.length;x++) {
			System.out.println(met[x]+",");
		}
		System.out.println("---获取类中的所有方法完成---");
		System.out.println("---再次开始获取类中的所有方法---");
		
		for(int i=0;i<met.length;i++) {
			String mod = Modifier.toString(met[i].getModifiers());
			String metName = met[i].getName();
			Class<?> ret = met[i].getReturnType();
			Class<?> param[] = met[i].getParameterTypes();
			Class<?> exc[] = met[i].getExceptionTypes();
			System.out.print(mod+" ");
			System.out.print(ret+" ");
			System.out.print(metName+"(");
			for (int x=0;x<param.length;x++) {
				System.out.print(param[x]+" arg-"+x);
				if(x<param.length-1) {
					System.out.print(",");
				}
			}
			System.out.print(")");
			if(exc.length>0) {
				System.out.print("throws");
			}
			for (int x=0;x<exc.length;x++) {
				System.out.print(exc[x].getName());
				if(x<exc.length-1) {
					System.out.print(",");
				}
			}
			System.out.println("");
		}
		System.out.println("---再次获取类中的所有方法完成---");
		System.out.println("---开始取得类的全部属性---");
		//下面的操作只能取得继承而来的公共属性
		Field f[] = c.getFields();
		for(int x=0;x<f.length;x++) {
			System.out.print(f[x]);
		}
		System.out.println();
		System.out.println("---取得类的全部属性完成---");
		System.out.println("---开始取得类的全部属性---");
		//下面的操作只能取得自定义的属性
		Field f1[] = c.getDeclaredFields();
		for(int x=0;x<f1.length;x++) {
			System.out.print(f1[x]+" ");
		}
		System.out.println();
		System.out.println("---取得类的全部属性完成---");
	
	}

}
