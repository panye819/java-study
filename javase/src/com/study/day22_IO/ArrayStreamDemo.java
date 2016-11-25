package com.study.day22_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 内存操作流
 * 	ByteArrayInputStream 包含一个内部缓冲区，该缓冲区包含从流中读取的字节。内部计数器跟踪 read 方法要提供的下一个字节。 
 *		关闭 ByteArrayInputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。
 *  ByteArrayOutputStreamextends 实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。
 * 		可使用 toByteArray() 和 toString() 获取数据。 
 * 		关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。 
 */
public class ArrayStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<10;x++){
			baos.write(("hello"+x).getBytes());
		}
		
		byte[] bys = baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		
		int len = 0;
		while((len=bais.read()) != -1){
			System.out.print((char)len);
		}
	}

}
