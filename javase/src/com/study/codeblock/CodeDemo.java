package com.study.codeblock;

/**
 * ��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ�����
 * 	����λ�ú�������ͬ�����Է�Ϊ
 * 	1���ֲ������
 * 		�ڷ����г��֣��ֲ�λ�ã������޶���������������
 * 	2����������
 * 		�ڹ��췽����λ�ã������з�������֣��Ѷ�����췽������ͬ�Ĵ������һ����{}��������ÿ�ε��ù��췽����ִ�У������ڹ��췽��֮ǰִ�С�
 * 		���ã�
 * 			�Ѷ�����췽���еĹ�ͬ�������һ��
 * 	3����̬�����
 * 		�����еĳ�Աλ�ã���{}��������ֻ��������static�����ˣ�
 * 		���ã�
 * 			һ���Ƕ�����г�ʼ��
 * ������ִ��˳��
 * 		��̬�����--->��������--->���췽�������Ҿ�̬�����ִֻ��һ�Ρ�
 *
 */
class Code{
	
	static {
		int z = 1000;
		System.out.println("z: "+z);
		System.out.println("���Ǿ�̬�����1");
	}
	
	{
		int n = 10010;
		System.out.println("n: "+n);
		System.out.println("���ǹ�������3");
	}
	
	{
		int y=20;
		System.out.println("y: "+y);
		System.out.println("���ǹ�������1");
	}
	
	
	public Code(){
		System.out.println("Code");
		
	}
	public Code(int a){
		System.out.println("Code+1");
	}
	
	{
		int y1=30;
		System.out.println("y1: "+y1);
		System.out.println("���ǹ�������2");
	}
	
	static {
		int m = 10086;
		System.out.println("m: "+m);
		System.out.println("���Ǿ�̬�����2");
		}
}

public class CodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			{
//				int x = 10;
//			}
		 	int x = 10;
			System.out.println("x: "+x);
			
			Code c1 = new Code();
			System.out.println("--------------------");
			Code c2 = new Code();
			System.out.println("--------------------");
			Code c3 = new Code(1);
			
			
			
	}

}
