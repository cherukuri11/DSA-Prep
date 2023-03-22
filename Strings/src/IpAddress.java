
/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/
class IpAddress {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            sb.append(c == '.' ? "[.]" : c);
        }
        return sb.toString();
    }
}