package pt5_2;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Principal {

	public static void main(String[] args) {
		crearXML();
		menu();
	}

	public static void crearXML() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();

			// element raiz
			Element raiz = doc.createElement("cursos");
			doc.appendChild(raiz);

			// elements curs
			Element curs = doc.createElement("curs");
			raiz.appendChild(curs);
			Element curs2 = doc.createElement("curs");
			raiz.appendChild(curs2);

			// atribut per als nodes curs
			Attr attr = doc.createAttribute("id");
			attr.setValue("AMS2");
			curs.setAttributeNode(attr);
			Attr attr2 = doc.createAttribute("id");
			attr2.setValue("AWS2");
			curs2.setAttributeNode(attr2);

			// element tutor
			Element tutor = doc.createElement("tutor");
			tutor.appendChild(doc.createTextNode("David"));
			curs.appendChild(tutor);
			// element tutor2
			Element tutor2 = doc.createElement("tutor");
			tutor2.appendChild(doc.createTextNode("Leandro"));
			curs2.appendChild(tutor2);

			// elements alumnes AMS
			Element alumnes = doc.createElement("alumnes");
			curs.appendChild(alumnes);
			// alumne
			Element alumne = doc.createElement("alumne");
			alumne.appendChild(doc.createTextNode("Darius"));
			alumnes.appendChild(alumne);
			// alumne2
			Element alumne2 = doc.createElement("alumne");
			alumne2.appendChild(doc.createTextNode("Uson"));
			alumnes.appendChild(alumne2);
			// alumne3
			Element alumne3 = doc.createElement("alumne");
			alumne3.appendChild(doc.createTextNode("Salas"));
			alumnes.appendChild(alumne3);

			// elements alumnes AWS
			Element alumnes2 = doc.createElement("alumnes");
			curs2.appendChild(alumnes2);
			// alumne4
			Element alumne4 = doc.createElement("alumne");
			alumne4.appendChild(doc.createTextNode("Alexis"));
			alumnes2.appendChild(alumne4);
			// alumne5
			Element alumne5 = doc.createElement("alumne");
			alumne5.appendChild(doc.createTextNode("Roger"));
			alumnes2.appendChild(alumne5);
			// alumne6
			Element alumne6 = doc.createElement("alumne");
			alumne6.appendChild(doc.createTextNode("Marc"));
			alumnes2.appendChild(alumne6);

			// element modul
			Element moduls = doc.createElement("moduls");
			curs.appendChild(moduls);
			Element modul = doc.createElement("modul");
			moduls.appendChild(modul);
			// element modul2
			Element moduls2 = doc.createElement("moduls");
			curs2.appendChild(moduls2);
			Element modul2 = doc.createElement("modul");
			moduls2.appendChild(modul2);

			// atributs per als nodes modul
			Attr attr3 = doc.createAttribute("id");
			attr3.setValue("M06");
			modul.setAttributeNode(attr3);
			// atributs per als nodes modul2
			Attr attr4 = doc.createAttribute("id");
			attr4.setValue("M01");
			modul2.setAttributeNode(attr4);

			// elements titol
			Element titol = doc.createElement("titol");
			titol.appendChild(doc.createTextNode("Acces a dades"));
			modul.appendChild(titol);
			// elements titol2
			Element titol2 = doc.createElement("titol");
			titol2.appendChild(doc.createTextNode("Sistemes informatics"));
			modul2.appendChild(titol2);

			// elements profe
			Element profes = doc.createElement("profes");
			modul.appendChild(profes);
			Element profe = doc.createElement("profe");
			profe.appendChild(doc.createTextNode("Rafa"));
			profes.appendChild(profe);
			Element profe2 = doc.createElement("profe");
			profe2.appendChild(doc.createTextNode("Enric"));
			profes.appendChild(profe2);
			// elements profe2
			Element profes2 = doc.createElement("profes");
			modul2.appendChild(profes2);
			Element profe3 = doc.createElement("profe");
			profe3.appendChild(doc.createTextNode("Laura"));
			profes2.appendChild(profe3);

			// elements ufs1
			// uf1
			Element ufs = doc.createElement("ufs");
			modul.appendChild(ufs);
			Element uf1 = doc.createElement("uf");
			ufs.appendChild(uf1);
			Attr attr5 = doc.createAttribute("n");
			attr5.setValue("1");
			uf1.setAttributeNode(attr5);
			uf1.appendChild(doc.createTextNode("Persistencia en fitxers"));
			// uf2
			Element uf2 = doc.createElement("uf");
			ufs.appendChild(uf2);
			Attr attr6 = doc.createAttribute("n");
			attr6.setValue("2");
			uf2.setAttributeNode(attr6);
			uf2.appendChild(doc.createTextNode("Persistencia en BDR-BDOR-BDOO"));
			// uf3
			Element uf3 = doc.createElement("uf");
			ufs.appendChild(uf3);
			Attr attr7 = doc.createAttribute("n");
			attr7.setValue("3");
			uf3.setAttributeNode(attr7);
			uf3.appendChild(doc.createTextNode("Persistencia en BD natives XML"));
			// uf4
			Element uf4 = doc.createElement("uf");
			ufs.appendChild(uf4);
			Attr attr8 = doc.createAttribute("n");
			attr8.setValue("4");
			uf4.setAttributeNode(attr8);
			uf4.appendChild(doc.createTextNode("Components d'acces a dades"));

			// elements ufs2
			// uf1
			Element ufs2 = doc.createElement("ufs");
			modul2.appendChild(ufs2);
			Element uf11 = doc.createElement("uf");
			ufs2.appendChild(uf11);
			Attr attr9 = doc.createAttribute("n");
			attr9.setValue("1");
			uf11.setAttributeNode(attr9);
			uf11.appendChild(doc.createTextNode("Instal.lacio, configuracio i explotacio d'un SI"));
			// uf2
			Element uf22 = doc.createElement("uf");
			ufs2.appendChild(uf22);
			Attr attr10 = doc.createAttribute("n");
			attr10.setValue("2");
			uf22.setAttributeNode(attr10);
			uf22.appendChild(doc.createTextNode("Gestio de la informacio i de recursos en una xarxa"));
			// uf3
			Element uf33 = doc.createElement("uf");
			ufs2.appendChild(uf33);
			Attr attr11 = doc.createAttribute("n");
			attr11.setValue("3");
			uf33.setAttributeNode(attr11);
			uf33.appendChild(doc.createTextNode("Implantacio de programari especific"));

			// clases necesarias para finalizar la creación del archivo XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("..\\UF1_Pt5_2\\src\\pt5_2\\cicles.xml"));
			transformer.transform(source, result);
			System.out.println("Fitxer xml creat.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void menu() {
		Scanner lector = new Scanner(System.in);
		int i = 0;
		while (i != 3) {
			boolean b = false;
			System.out.println("\n---MENU---");
			System.out.println("1. Afegir alumne");
			System.out.println("2. Eliminar alumne");
			System.out.println("3. Sortir");
			System.out.print("Escull una opcio: ");
			i = lector.nextInt();
			if (i > 0 && i < 4) {
				switch (i) {
				case 1:
					b = true;
					tractamentXML(b);
					break;
				case 2:
					tractamentXML(b);
					break;
				default:
					System.out.println("\nAdeu!");
					break;
				}
			} else
				System.out.println("\nError! Valor incorrecte.");
		}
	}

	public static void tractamentXML(boolean b) {
		Scanner lector = new Scanner(System.in);
		File fichero = new File("..\\UF1_Pt5_2\\src\\pt5_2\\cicles.xml");
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fichero);
			doc.getDocumentElement().normalize();
			// pedimos el id del curso
			System.out.println("\nIntrodueix el id del curs (AMS2 | AWS2):");
			String id = lector.nextLine();
			NodeList nList = doc.getElementsByTagName("curs");
			if (b == true)
				afegirAlumne(doc, nList, id);
			else
				eliminarAlumne(doc, nList, id);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("..\\UF1_Pt5_2\\src\\pt5_2\\cicles.xml"));
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void afegirAlumne(Document doc, NodeList nList, String id) {
		Scanner lector = new Scanner(System.in);
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				// si el nodo = alumnes
				if (nNode.getNodeName().equals("alumnes")) {
					// pedimos el nombre del alumno y lo insertamos
					System.out.println("Introdueix el nom del alumne:");
					String nom = lector.nextLine();
					Element alumne = doc.createElement("alumne");
					alumne.appendChild(doc.createTextNode(nom));
					nNode.appendChild(alumne);
					System.out.println("\nAlumne afegit correctament.");
				}
				// comprobamos si el nodo tiene atributos
				if (nNode.hasAttributes()) {
					// obtenemos los atributos y su valor
					NamedNodeMap nodeMap = nNode.getAttributes();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						Node tempNode = nodeMap.item(i);
						// comprobamos que el curso existe
						if (id.equals(tempNode.getNodeValue())) {
							// comprobamos si tiene hijos
							if (nNode.hasChildNodes()) {
								afegirAlumne(doc, nNode.getChildNodes(), id);
							}
						}
					}
				}
			}
		}
	}

	public static void eliminarAlumne(Document doc, NodeList nList, String id) {
		Scanner lector = new Scanner(System.in);
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				// si el nodo = alumnes
				if (nNode.getNodeName().equals("alumnes")) {
					// pedimos el nombre del alumno
					System.out.println("Introdueix el nom del alumne:");
					String nom = lector.nextLine();
					for (int i = 0; i < nNode.getChildNodes().getLength(); i++) {
						Element eElement = (Element) nNode;
						NodeList alumnes = eElement.getElementsByTagName("alumne");
						Element alumne = (Element) alumnes.item(i);
						// lo eliminamos si el alumno = elemento alumno
						if (nom.equals(alumne.getTextContent())) {
							Node parent = alumne.getParentNode();
							parent.removeChild(alumne);
							System.out.println("\nAlumne eliminat correctament.");
						}
					}
				}
				// comprobamos si el nodo tiene atributos
				if (nNode.hasAttributes()) {
					// obtenemos los atributos y su valor
					NamedNodeMap nodeMap = nNode.getAttributes();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						Node tempNode = nodeMap.item(i);
						// comprobamos que el curso existe
						if (id.equals(tempNode.getNodeValue())) {
							// comprobamos si tiene hijos
							if (nNode.hasChildNodes()) {
								eliminarAlumne(doc, nNode.getChildNodes(), id);
							}
						}
					}
				}
			}
		}
	}
}
