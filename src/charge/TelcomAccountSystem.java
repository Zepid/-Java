package charge;

public class TelcomAccountSystem {
	public static void main(String[] args) {
		// ʵ����-�������û���TelcomUser
		TelcomUser telcomUser = new TelcomUser("1**********");
		// ����ͨ����¼
		telcomUser.generateCommunicateRecord();
		// ��ӡͨ���굥
		telcomUser.printDetails();
	}
}