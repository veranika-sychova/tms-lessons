package by.tms.lesson7.homework3;

public class Register implements RegisterInterface {

    private Document[] documents;

    public Register() {
    }

    public Register(int maxNumberOfDocuments) {
        this.documents = new Document[maxNumberOfDocuments];
    }

    @Override
    public void saveDocument(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
            }
        }
    }


    @Override
    public void showDocumentInfo(String documentNumber) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null && documents[i].getDocumentNumber() == documentNumber) {
                System.out.println(documents[i]);
                return;
            }
        }
        System.out.println("Wrong document number");
    }

}