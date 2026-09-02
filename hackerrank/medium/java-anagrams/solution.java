

    static boolean isAnagram(String a, String b) {
        // Complete the function    
        a = a.toLowerCase();
        b = b.toLowerCase();
        while (true){
        if (a.length() != b.length()) return false;
        if (a.length() == 0 && b.length() == 0) return true;
        
        char ch = a.charAt(0);
        a = a.replace(ch + "" , "");
        b = b.replace(ch+ "", "");
        }
    }

