package ThreadingByAman.ThraedLocal.InheritableThreadLocal;

/*🔍 Core Reason:
A ThreadLocal stores values per thread.
It is thread-isolated and deliberately designed not to share its value between
threads — even between parent and child.*/

/*⚙️ Internal Working (Simplified):
When you call threadLocal.set("value"), that value is stored inside the current thread’s ThreadLocalMap.
When you create a new thread, it starts with a fresh, empty ThreadLocalMap.
Therefore, the new thread has no access to the parent thread’s ThreadLocal values.
*/


public class InheritableThreadLocalExample2 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("FaceBook");


        //child
        Thread thread = new Thread(() ->{
            System.out.println(threadLocal.get());
        });
        thread.start();


    }
}
