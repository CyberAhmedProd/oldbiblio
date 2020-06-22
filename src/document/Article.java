package document;

import java.util.Date;

import utility.Localistion;

public class Article extends Document {
	private String nomAuthor;
	private Date datePubication;
	public Article() {
		super();
		this.type="Article";
	}
	public Article(String titre, Localistion localisation, String type, int nbre_exemp, String nomAuthor, Date datePublication) {
		super(titre, localisation, type, nbre_exemp);
		this.datePubication = datePublication;
		this.nomAuthor = nomAuthor;
	}
	public String getNomAuthor() {
		return nomAuthor;
	}
	public void setNomAuthor(String nomAuthor) {
		this.nomAuthor = nomAuthor;
	}
	public Date getDatePubication() {
		return datePubication;
	}
	public void setDatePubication(Date datePubication) {
		this.datePubication = datePubication;
	}
	@Override
	public String toString() {
		return "Article [nomAuthor=" + nomAuthor + ", datePubication=" + datePubication + ", id_doc=" + id_doc
				+ ", titre=" + titre + ", localisation=" + localisation + ", type=" + type + ", nbre_exemp="
				+ nbre_exemp + ", getNomAuthor()=" + getNomAuthor() + ", getDatePubication()=" + getDatePubication()
				+ ", getId_doc()=" + getId_doc() + ", getTitre()=" + getTitre() + ", getLocalisation()="
				+ getLocalisation() + ", getType()=" + getType() + ", getNbre_exemp()=" + getNbre_exemp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
