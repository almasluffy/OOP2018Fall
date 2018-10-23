package Problem2;
//this is interface inherited by 2 super
public interface MainShow extends Show1,Show2 {
    //inherits same constants with same name(val)
    int val = 3;
    int a = Show1.val + val;
    int b = Show2.val + val;

}
