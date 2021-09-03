package day16;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
//		parser.parse2();
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");
	}
}
/*���
document.xml-XML parsing completed.
document.html-HTML parsing completed.
*/