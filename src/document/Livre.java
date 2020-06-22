package document;

import java.util.Date;

import utility.Localistion;

public class Livre extends Document{
	private String nomAuthor;
	private String nomEdition;
	private Date dateEdition;
	public Livre() {
		super();
		this.type = "Livre";
	}
	public Livre(String titre, Localistion localisation, String type, int nbre_exemp, String nomAuthor, String nomEdition, Date dateEdition) {
		super(titre, localisation, type, nbre_exemp);
		this.nomAuthor = nomAuthor;
		this.nomEdition = nomEdition;
		this.dateEdition = dateEdition;
	}
	public String getNomAuthor() {
		return nomAuthor;
	}
	public void setNomAuthor(String nomAuthor) {
		this.nomAuthor = nomAuthor;
	}
	public String getNomEdition() {
		return nomEdition;
	}
	public void setNomEdition(String nomEdition) {
		this.nomEdition = nomEdition;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}
	@Override
	public String toString() {
		return "Livre [nomAuthor=" + nomAuthor + ", nomEdition=" + nomEdition + ", dateEdition=" + dateEdition
				+ ", id_doc=" + id_doc + ", titre=" + titre + ", localisation=" + localisation + ", type=" + type
				+ ", nbre_exemp=" + nbre_exemp + ", getNomAuthor()=" + getNomAuthor() + ", getNomEdition()="
				+ getNomEdition() + ", getDateEdition()=" + getDateEdition() + ", getId_doc()=" + getId_doc()
				+ ", getTitre()=" + getTitre() + ", getLocalisation()=" + getLocalisation() + ", getType()=" + getType()
				+ ", getNbre_exemp()=" + getNbre_exemp() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
