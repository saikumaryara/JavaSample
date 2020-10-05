class DaemonDemo implements Runnable{
	Thread th;
    public DaemonDemo() {
         th=new Thread(this);
         th.setDaemon(true);
         th.start();
         //th.start(); RE::IllTSE
    }
	@Override
	public void run() {
		System.out.println("run "+th.isDaemon());
		for(int i=0;i<=100;i++) {
			System.out.println("run "+i);
		}
	}
	public static void main(String[] args) {
		DaemonDemo d1=new DaemonDemo();
		System.out.println("countdown start");
		for(int i=0;i<=5;i++) {
			System.out.println("main "+i);
		}
	}
}