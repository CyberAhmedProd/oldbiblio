package document;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	public void afficheDocument() {
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		System.out.format("%15d|%10s|%3d|%32s|%10s|%10s|%9s|%16s|%16s\n",id_doc,type,nbre_exemp,titre,localisation.getSalle(),localisation.getRayon(),formater.format(dateEdition),nomAuthor,nomEdition);
		System.out.format("%135s\n","---------------------------------------------------------------------------------------------------------------------------------");
	}
	
	
}
