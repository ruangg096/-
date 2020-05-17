package homework;


import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
//	private Boolean ready=true;
	
	//�������
	private int i=0;

	//��������
	Student stList[]=new Student[20];
	
//	public void setReady(Boolean ready) {
//		this.ready=ready;
//	该处注释不必要
	//��ʼ������
	public void init() {
		for(int l=0;l<20;l++) {
			stList[l]=new Student();
		}
	}
	
	//��ʾ����
	@SuppressWarnings("resource")
	public void app() {
//		ready=false;
		Scanner x=new Scanner(System.in);
		System.out.println("��ѡ�������");
		System.out.println("*********************************************************");
		System.out.println("*                         1.����                        *");
		System.out.println("*                         2.����                        *");
		System.out.println("*                         3.ɾ��                        *");
		System.out.println("*                         4.�޸�                        *");
		System.out.println("*                         5.���                        *");
		System.out.println("*                         6.�˳�                        *");
		System.out.println("*********************************************************");
		//ѡ�����
		switch(x.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				seek();
				break;
			case 3:
				delete();
				break;
			case 4:
				change();
				break;
			case 5:
				printAll();
				break;
			case 6:
				leave();
				break;
		}
	}
	//����
	@SuppressWarnings("resource")
	public void insert() {
//		ready=true;复杂的分支流程未被注释 5
//      该函数是二十条学生信息的输出
		if(i<20) {
			Student st = new Student();
			Scanner id=new Scanner(System.in);
			System.out.println("������ѧ��ѧ�ţ�");
			st.setID(id.nextInt());
			Scanner name=new Scanner(System.in);
			System.out.println("������ѧ��������");
			st.setName(name.next());
			Scanner birDay=new Scanner(System.in);
			System.out.println("������ѧ�����գ�");
			st.setBirDay(birDay.next());
			Scanner gender=new Scanner(System.in);
			System.out.println("������ѧ���Ա�");
			st.setGender(gender.nextBoolean());
			stList[i]=st;
			i++;
			//�������򣨰�ID��С��
			Arrays.sort(stList);
		}
		else {
			System.out.println("�Ѿ������ˣ�");
		}
		app();
	}
	//����
	public void seek() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("�������ѧ��ѧ�ţ�");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean can=true;
		for(int k=0;k<j;k++) {
			if(stList[k].getID()==st.getID()) {
				can=false;
				System.out.println("Student [ID=" + stList[k].getID() + ", name=" + stList[k].getName() +",=birDay"+ stList[k].getBirDay() + ",gender" + stList[k].getGender() + "]");
			}
		}
		//该处循环作用：按照学号查找学生并且显示学生信息。
		if(can) {
			System.out.println("û�и�ѧ����Ϣ");
		}
		Arrays.sort(stList);
		app();
	}
	//ɾ��
	public void deleteterm() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("�������ѧ��ѧ�ţ�");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean have=true;
		for(int k=0;k<j;k++) {
			if(stList[k].getID()==st.getID()) {
				have=false;
				stList[k].setID(100000000);
				stList[k].setName(null);
				stList[k].setBirDay(null);
				stList[k].setGender(null);	
			}
		}
		if(have) {
			System.out.println("û�и�ѧ����Ϣ");
		}
		Arrays.sort(stList);
		app();
	}
	//�޸�
	public void change() {
//		ready=true;
		Student st = new Student();
		Scanner id=new Scanner(System.in);
		System.out.println("�������ѧ��ѧ�ţ�");
		st.setID(id.nextInt());
		int j=stList.length;
		boolean have=true;
		for(int index = 0; index <j; index++) {
			if(stList[index].getID()==st.getID()) {
				have=false;
				Scanner id1=new Scanner(System.in);
				System.out.println("������ѧ��ѧ�ţ�");
				stList[index].setID(id1.nextInt());
				Scanner name=new Scanner(System.in);
				System.out.println("������ѧ��������");
				stList[index].setName(name.next());
				Scanner birDay=new Scanner(System.in);
				System.out.println("������ѧ�����գ�");
				stList[index].setBirDay(birDay.next());
				Scanner gender=new Scanner(System.in);
				System.out.println("������ѧ���Ա�");
				stList[index].setGender(gender.nextBoolean());
			}
		}
		if(have) {
			System.out.println("û�и�ѧ����Ϣ");
		}
		Arrays.sort(stList);
		app();
	}
	//�������ѧ����Ϣ
	public void printAll() {
//		ready=true;
		System.out.println(Arrays.toString(stList));
		app();
	}
	//�˳�
	public void leave() {
	}
}
