package com.learning.DOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseKnownXMLStructure {

    public static void main(String[] args) throws Exception {
        // Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Build Document
        Document document = builder.parse(new File("Src/main/resources/employees.xml"));

        // Normalize the XML Structure; Its just too important !!!
        document.getDocumentElement().normalize();

        // Here comes the root node
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        // get all employees
        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("==============================");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                // print each employee's detail
                Element eElement = (Element) node;
                System.out.println("Employee id : " + eElement.getAttribute("id"));
                System.out
                        .println("First Name : " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name : " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Location : " + eElement.getElementsByTagName("location").item(0).getTextContent());

            }
        }

    }

}
