package org.cbrogansoftware.poc;

public class ClassC {

    private final ClassA classA;
    private final ClassB classB;

    public ClassC(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    protected String combineString() {
        final String str1 = classA.getSomeString();
        final String str2 = classB.getSomeString();
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(" and ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
