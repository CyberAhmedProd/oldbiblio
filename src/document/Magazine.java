package document;

import utility.Localistion;

public class Magazine extends Document{
	private int frequence;

	public Magazine() {
		super();
		this.type="Magazine";
	}

	public Magazine(String titre, Localistion localisation, String type, int nbre_exemp,int frequence) {
		super(titre, localisation, type, nbre_exemp);
		this.frequence = frequence;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	@Override
	public String toString() {
		return "Magazine [frequence=" + frequence + ", id_doc=" + id_doc + ", titre=" + titre + ", localisation="
				+ localisation + ", type=" + type + ", nbre_exemp=" + nbre_exemp + ", getFrequence()=" + getFrequence()
				+ ", getId_doc()=" + getId_doc() + ", getTitre()=" + getTitre() + ", getLocalisation()="
				+ getLocalisation() + ", getType()=" + getType() + ", getNbre_exemp()=" + getNbre_exemp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
