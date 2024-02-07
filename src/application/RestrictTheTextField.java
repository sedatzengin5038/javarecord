package application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.Tooltip;


public class RestrictTheTextField extends TextField {
	
	



			private IntegerProperty maxLength = new SimpleIntegerProperty(this,
					"maxLength", -1);
			private StringProperty restrict = new SimpleStringProperty(this, "restrict");
			private StringProperty space = new SimpleStringProperty(this, "space");

			public RestrictTheTextField() {
				textProperty().addListener(new ChangeListener<String>() {
					private boolean ignore;

					@Override
					public void changed(
							ObservableValue<? extends String> observableValue,
							String s, String s1) {
						if (ignore || s1 == null)
							return;
						if (maxLength.get() > -1 && s1.length() > maxLength.get()) {
							ignore = true;
							setText(s1.substring(0, maxLength.get()));
							ignore = false;
						}
						if (restrict.get() != null && !restrict.get().equals("")
								&& !s1.matches(restrict.get() + "*")) {
							ignore = true;
							setText(s);
							ignore = false;
						}
						
					}
					
				});
			}
			 
		
			
			public void setMaxLength(int maxLength) {
				this.maxLength.set(maxLength);
			}

			
		
			public String getRestrict() {
				return restrict.get();
			}

		
			public void setRestrict(String restrict) {
				this.restrict.set(restrict);
			}

			
			
			
		
			public void setIntegerField() {
				this.setRestrict("[0-9]");
			}
			
			
		

}
