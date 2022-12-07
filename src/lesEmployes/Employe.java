package lesEmployes;

public class Employe {
	private String prenomNom;
	private String addMail;
	private String addDomicile;
	private String telephoneNum;
	private int expRestRapide; //l'expérience de l'employé dans la restauration rapdie
	
	
	public Employe(String prenomNom, String addMail, String addDomicile, String telephoneNum, int expRestRapide) {
		this.prenomNom = prenomNom;
		this.addMail = addMail;
		this.addDomicile = addDomicile;
		this.telephoneNum = telephoneNum;
		this.expRestRapide = expRestRapide;
	}


	public String getPrenomNom() {
		return prenomNom;
	}


	public String getAddMail() {
		return addMail;
	}


	public void setAddMail(String addMail) {
		this.addMail = addMail;
	}


	public String getAddDomicile() {
		return addDomicile;
	}


	public void setAddDomicile(String addDomicile) {
		this.addDomicile = addDomicile;
	}


	public String getTelephoneNum() {
		return telephoneNum;
	}


	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}


	public int getExpRestRapide() {
		return expRestRapide;
	}


	public void setExpRestRapide(int expRestRapide) {
		this.expRestRapide = expRestRapide;
	}


	@Override
	public String toString() {
		return "Employe [prenomNom=" + prenomNom + ", addMail=" + addMail + ", addDomicile=" + addDomicile
				+ ", telephoneNum=" + telephoneNum + ", expRestRapide=" + expRestRapide + "]";
	}
	
	//L'employé peut changer son adresse domicile
	public void changerAddDomicile(String newAdd) {
		setAddDomicile(newAdd);
		System.out.println("☺ Le changement de votre adresse a belle et bien été pris en compte");
		System.out.println("Votre nouvelle adresse est "+newAdd);
		
	}
	
	
	//L'employé peut changer son numéro de téléphone
	public void changerTelephoneNum(String newTelephoneNum ) {
		setAddDomicile(newTelephoneNum);
		System.out.println("☺ Le changement de votre numéro portable a belle et bien été pris en compte");
		System.out.println("Votre nouveau numéro portable est "+newTelephoneNum);
		
	}
	
	//L'employé peut changer son adresse mail
	public void changerAddMail(String newAddMail) {
		setAddDomicile(newAddMail);
		System.out.println("☺ Le changement de votre adresse mail a belle et bien été pris en compte");
		System.out.println("Votre nouvelle adresse mail est "+newAddMail);
		
	}
	
	
	
}
