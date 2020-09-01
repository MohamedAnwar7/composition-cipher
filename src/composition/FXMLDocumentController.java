/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea t,t2;
    
    @FXML
    private void encrypt(ActionEvent event) {
        String s,temp="",enc="";
        s=t.getText();
        for(int i=0;i<s.length();i++)
    if(s.charAt(i)!=' ')
    temp+=s.charAt(i);
s=temp;
temp="";
for(int i=0,j;i<s.length();i++)
{
    temp+=(char)((s.charAt(i)-'a')/5+'a');
    temp+=(char)((s.charAt(i)-'a')%5+'a');
}
for(int i=0,j=temp.length()/2;i<temp.length()/2;i++,j++)
{
    enc+=(char)((temp.charAt(i)-'a')*5+(temp.charAt(j)-'a')+'a');


}
     t2.setText(enc);
    }
    @FXML
    private void dncrypt(ActionEvent event) {
        String s,temp="",dnc="";
        s=t.getText();
                for(int i=0;i<s.length();i++)
    if(s.charAt(i)!=' ')
    temp+=s.charAt(i);
s=temp;
temp="";
for(int i=0;i<s.length();i++)
{
    temp+=(char)((s.charAt(i)-'a')/5+'a');
     temp+=(char)((s.charAt(i)-'a')%5+'a');
}
String temp2="";

for(int i=0;i<temp.length();i+=2)
    temp2+=temp.charAt(i);

for(int i=1;i<temp.length();i+=2)
    temp2+=temp.charAt(i);

for(int i=0;i<temp2.length();i+=2)
{
  
    dnc+=(char)((temp2.charAt(i)-'a')*5+(temp2.charAt(i+1)-'a')+'a');


}
t2.setText(dnc);

        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
