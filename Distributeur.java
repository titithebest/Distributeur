import iut.algo.*;

/** Nom du programme  : Distributeur.java
  * Description       : Distributeur de boisson, de la section algo+ en version 1.
  * @author           : Tim Chambouleyron
  * date              : 06/07/2026
  */

public class Distributeur
{
	public static void main(String[] argv)
	{
		/*---------------*/
		/*    Données    */
		/*---------------*/

		/*  Constantes   */

		final double[] piece      = {2, 1, 0.50, 0.20, 0.10};
		final double[] produit    = {1.0, 1.5, 3.1};
		final String[] nomProduit = {"bouteille d'eau", "soda", "biscuits"};

		// 1.0 bouteille d'eau
		// 1.5 soda
		// 3.1 biscuits

		/*   Variables   */

		int nbPiece, choix;
		double totalMonaie, renduMonaie;

		/*---------------*/
		/* Instructions  */
		/*---------------*/

		totalMonaie  = 0;
		nbPiece      = 0;
		choix        = 0;
		renduMonaie  = 0;

		System.out.println("\n" + "Veulliez insérer vos pièces (0.10 0.20 0.50 1 2) :" + "\n");

		System.out.print("nb pieces 0,10 euro : ");
		nbPiece = Clavier.lire_int();
		totalMonaie += nbPiece * piece[4];
		System.out.print("nb pieces 0,20 euro : ");
		nbPiece = Clavier.lire_int();
		totalMonaie += nbPiece * piece[3];
		System.out.print("nb pieces 0,50 euro : ");
		nbPiece = Clavier.lire_int();
		totalMonaie += nbPiece * piece[2];
		System.out.print("nb pieces 1    euro : ");
		nbPiece = Clavier.lire_int();
		totalMonaie += nbPiece * piece[1];
		System.out.print("nb pieces 2    euro : ");
		nbPiece = Clavier.lire_int();
		totalMonaie += nbPiece * piece[0];

		System.out.println("\n" + "\t" + "Montant inséré : " + totalMonaie + "\n");

		for (int i = 0; i <= 2; i++)
		{
			System.out.println(i + "." + " " + nomProduit[i] + " " + produit[i] + "€");
		}

		System.out.print("\n" + "\t" + "votre choix : ");
		choix = Clavier.lire_int();

		if (totalMonaie < produit[choix])
		{
			System.out.println("Pas assez d'argent !");
		}
		else 
		{
			totalMonaie = totalMonaie - produit[choix];

			System.out.println("\n" + "\t" + "Rendu monaie : " + totalMonaie);
			System.out.println("\n" + "Nous vous souhaitons une bonne dégustation !" + "\n");
		}

	}
}