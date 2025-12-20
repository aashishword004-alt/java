    class t1 extends Thread{
        public void run(){
            for(int i=0; i<5; i++){
                System.out.println("thread 1 " + i);
            }
            System.out.println("exit from thread 1");
        }
    
    public static void main(String args[]){
        t1  obj = new t1();
         Thread th  = new Thread(obj);
         th.start();;
    }
}
