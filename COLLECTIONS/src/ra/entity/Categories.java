package ra.entity;


    public class Categories implements IShop {

        private int catalogId;
        private String catalogName;
        private Boolean status;

        public Categories() {
        }

        public Categories(int catalogId, String catalogName, Boolean status) {
            this.catalogId = catalogId;
            this.catalogName = catalogName;
            this.status = status;
        }

        public int getCatalogId() {
            return catalogId;
        }

        public void setCatalogId(int catalogId) {
            this.catalogId = catalogId;
        }

        public String getCatalogName() {
            return catalogName;
        }

        public void setCatalogName(String catalogName) {
            this.catalogName = catalogName;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }


        @Override
        public void inputData() {

        }

        @Override
        public void displayData() {

        }
    }