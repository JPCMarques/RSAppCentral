package common;

public interface FactoryConstructor<ConstructedClass>{
    ConstructedClass construct(Object... args);
    String computeId(Object... args);
}
