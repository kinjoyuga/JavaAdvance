package oop;

public class smartPhone {
    public static class Account {
        //フィールド
        private String name;
        private String tel;
        private String email;
        private String address;

        //コントラクタ
        public Account(String name, String tel,String email,String address) {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.address = address;
        }

        //メソッド
        public String getAccountInfo() {
            return "name : " + name + "\ntel: " + tel + "\nemail: " + email + "\naddress: " + address;
        }
    }

     public static class AddressBook {
        //フィールド
        private String name;
        private String tel;
        private String email;

        //コントラクタ
        public AddressBook(String name, String tel, String email) {
            this.name = name;
            this.tel = tel;
            this.email = email;
        }
    }

    public static class SmartPhone {
        //フィールド
        String model;
        String os;
        Account account;
        AddressBook[] addressBooks;
        String[] apps;

        //コントラクタ
        public SmartPhone(String model, String os) {
            this.model = model;
            this.os = os;
            this.addressBooks = new AddressBook[10];
        }

        //メソッド1
        public void setAccount(Account account) {
            this.account = account;
        }

        //メソッド2
        public void displayDeviceInfo() {
            System.out.println("Model: " + model);
            System.out.println("OS: " + os);
        }

        //メソッド3
        public void displayMyAccount() {
            System.out.println("Account Info:");
            System.out.println(account.getAccountInfo());
        }

        //メソッド4
        public boolean addAddressBook(AddressBook addressBook) {
            for (int i = 0; i < addressBooks.length; i++) {
                if (addressBooks[i] == null) {
                    addressBooks[i] = addressBook;
                    return true;
                }
            }
            return false;
        }

        //メソッド5
        public void displayAppList() {
            System.out.println("Apps一覧:");
            if (this.apps == null) {
                this.apps = new String[10];
            }
            for (String app : apps) {
                if (app != null) {
                    System.out.println("- " + app);
                }
            }
        }

    }

}
