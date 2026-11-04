class Badge {
    public String print(Integer id, String name, String department) {
        String idPart = "";

        if(id != null){
            idPart = "[" + id + "] - ";
        }

        String deptPart = "";
        if(department == null){
            deptPart = " - OWNER";
        }else{
            deptPart = " - " + department.toUpperCase();
        }

        return idPart + name + deptPart;
        
    }
}
