package document;
import utility.Localistion;
public class Document {
	protected int id_doc=1;
	protected String titre;
	protected Localistion localisation;
	protected String type;//type= Livre ou Articles ou Magazines
	protected int nbre_exemp;//Nombre d'exemplaire du Document
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(String titre, Localistion localisation, String type, int nbre_exemp) {
		super();
		this.titre = titre;
		this.localisation = localisation;
		this.type = type;
		this.nbre_exemp = nbre_exemp;
	}
	public int getId_doc() {
		return id_doc;
	}
	public void setId_doc(int id_doc) {
		this.id_doc = id_doc;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Localistion getLocalisation() {
		return localisation;
	}
	public void setLocalisation(Localistion localisation) {
		this.localisation = localisation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNbre_exemp() {
		return nbre_exemp;
	}
	public void setNbre_exemp(int nbre_exemp) {
		this.nbre_exemp = nbre_exemp;
	}
	@Override
	public String toString() {
		return "Document [id_doc=" + id_doc + ", titre=" + titre + ", salle=" + localisation.getSalle() +", rayon=" + localisation.getRayon() + ", type=" + type
				+ ", nbre_exemp=" + nbre_exemp + "]";
	}
	
}
