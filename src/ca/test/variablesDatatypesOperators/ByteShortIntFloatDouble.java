package ca.test.variablesDatatypesOperators;

public class ByteShortIntFloatDouble {
	
	public void ByteShortIntFloatDouble() {
		// int 32 bits
		int myInt = 2_123_444; // "_" decimal separator was added in java 8
		
		// byte 8 bits
		byte mySmallByte = -128;
		byte myLargeByte = 127;
		
		// when calculating Java converts the result to "int"
		byte byteResult = (byte)(myLargeByte+122);
		System.out.println("Byte "+byteResult);
		
		// short 16 bits
		short myShort = 123;
		short shortResult = (short)(myShort*2);
		System.out.println("Short "+shortResult);
		
		// long 64 bits
		long myLong = 123_123_512_123L;
		// Calculation does not need to be casted to Long as 'long is larger than int'
		long longResult = myLong+10*myLargeByte+myInt;
		
		float myFloat = 5.3f;
		
		double myDouble = 5.23d;
	}

}
