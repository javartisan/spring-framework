package com.javartisan.spring.service.lookup.demo;

//1:javassit可以生成子类，但是Spring好像是没有用

import org.springframework.asm.ClassReader;
import org.springframework.asm.ClassWriter;
import org.springframework.asm.Opcodes;
import org.springframework.asm.Type;

import static org.springframework.asm.ClassWriter.COMPUTE_MAXS;
import static org.springframework.asm.Opcodes.ACC_PUBLIC;
import static org.springframework.asm.Opcodes.ACC_SUPER;

/**
 * 使用ASM工具模拟一个Lookup注解
 */
public class SimpleLookup {

	public static void main(String[] args) throws Exception {


		ClassReader cr = new ClassReader(UserService.class.getName());
		ClassWriter cw = new ClassWriter(cr, COMPUTE_MAXS);
		cr.accept(new UserServiceClassVisitor(Opcodes.ASM4), ClassReader.SKIP_DEBUG);

		cw.visit(Opcodes.V1_8, ACC_PUBLIC + ACC_SUPER, "Javartisan", null, "java/lang/Object", new String[]{Type.getType(UserService.class).getInternalName()});

		byte[] bytes = cw.toByteArray();

		JavartisanClassLoader classLoader = new JavartisanClassLoader();
//		Class clazz = classLoader.defineClassByName("Javartisan", bytes, 0, bytes.length);


		System.out.println();
	}
}
