# Overriding Hashcode And Equals

	According to java documentation of equals() method, any implementation should adhere to following principles.
	For any object x, x.equals(x) should return true.
	For any two object x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
	For multiple objects x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
	Multiple invocations of x.equals(y) should return same result, unless any of the object properties is modified that is being used in the equals() method implementation.
	Object class equals() method implementation returns true only when both the references are pointing to same object.
	
	
	https://www.journaldev.com/21095/java-equals-hashcode