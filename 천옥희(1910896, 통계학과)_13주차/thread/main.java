import java.awt.EventQueue;
class main{
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano f = new Piano();
					f.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}