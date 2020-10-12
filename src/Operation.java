public interface Operation <A, B, O, R>{
    public R apply(A arg1, B arg2, O arg3);
}