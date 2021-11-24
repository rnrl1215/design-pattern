package patterns.adapter.v1;

public class MathAdapterImpl implements MathAdapter{
    @Override
    public Float twice(Float value) {
        return (float)Math.twice(value.doubleValue());
    }

    @Override
    public Float half(Float value) {
<<<<<<< HEAD
        System.out.println("half 함수 호출");
=======
        System.out.println("half 함수 호출!!");
>>>>>>> origin/main
        return (float)Math.half(value.doubleValue());
    }
}
