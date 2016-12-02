package com.study.day27_reflect;

/**
 * ��ļ���
 * 	������Ҫʹ��ĳ����ʱ������໹δ�����ص��ڴ��У���ôϵͳ��ͨ�����أ����ӣ���ʼ���������裬��ʵ�ֶ���ĳ�ʼ����
 * 		���أ�
 * 			ָ��class�ļ������ڴ棬��Ϊ֮����һ��class����
 * 			�κ��౻ʹ��ʱ��ϵͳ���ᴴ��һ��class����
 * 		���ӣ�
 * 			��֤���Ƿ�����ȷ���ڲ��ṹ������������Э��һ��
 * 			׼��������Ϊ��ľ�̬��Ա�����ڴ棬������Ĭ�ϳ�ʼ��ֵ��
 * 			����������Ķ����������еķ��������滻Ϊֱ������
 * 		��ʼ����
 * 			������ǰ���۹�����ĳ�ʼ�����衣
 * 			��ĳ�ʼ��ʱ����
 * 				1���������ʵ��
 * 				2�������еľ�̬��������Ϊ��̬������ֵ
 * 				3��������ľ�̬����
 * 				4��ʹ�÷��䷽ʽ��ǿ�ƴ���ĳ���ӿڻ����Ӧ��java.lang.Class����
 * 				5����ʼ��ĳ��������ࡣ
 * 				6��ֱ��ʹ��java.exe������ĳ������
 * 		���������
 * 			����.class�ļ����ص��ڴ��У���Ϊ֮���ɶ�Ӧ��class�����˽�������ƿ��������Ǹ��õ������������
 * 			��ɣ�
 *  			1��Bootstrap ClassLoader ���������
 *  				Ҳ����Ϊ�����������������Java������ļ���
 *  			2��Extension ClassLoader ��չ�������
 *  				����JRE����չĿ¼��jar���ļ���
 *  			3��System ClassLoader ϵͳ�������
 *					������JVM����ʱ����������Java�����class�ļ����Լ�classpath����������ָ����jar������·����
 *		���䣺
 *			Java�������ʵ������״̬�У���������һ���࣬����֪���������������Ժͷ�������������һ�����󣬶��ܵ�����������һ��������
 *			���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�ΪJava���Եķ�����ơ�
 *			����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 *		��ȡclass�ļ�����ķ�ʽ��	
 *			1��Object���getClass()����
 *			2���������͵ľ�̬����class
 *			3��Class���еľ�̬����
 *				public static Class forName(String className)
 *				ע�⣺�������classNameһ��Ҫ���ϰ�����Ҫдȫ·������Ȼ�ᱨ��
 */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//��ȡclass�ļ�����ķ�ʽ
		//��ʽһ��
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		System.out.println(p==p2);
		System.out.println(c==c2);
		//��ʽ��
		Class c3 = Person.class;
		System.out.println(c == c3);
		//��ʽ��
		Class c4 = Class.forName("com.study.day27_reflect.Person");
		System.out.println(c == c4);
		
	}

}
