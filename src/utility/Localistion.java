package utility;

public class Localistion {
 private String rayon;
 private String salle;
 public Localistion() {
	super();
	// TODO Auto-generated constructor stub
 }
 public Localistion(String rayon, String salle) {
	super();
	this.rayon = rayon;
	this.salle = salle;
 }
 public String getRayon() {
	return rayon;
 }	
 public void setRayon(String rayon) {
	this.rayon = rayon;
 }
 public String getSalle() {
	return salle;
 }
 public void setSalle(String salle) {
	this.salle = salle;
 }
 
}
