package com.olivierloukombo.myharmonyosapp.slice;

import com.olivierloukombo.myharmonyosapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;

public class MainAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        TextField inputOutput = (TextField) findComponentById(ResourceTable.Id_input_output);
        findComponentById(ResourceTable.Id_addition).setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                inputOutput.setText(((Text)component).getText());
            }
        });
        Text minus = (Text) findComponentById(ResourceTable.Id_soustraction);
        Text multiplication = (Text) findComponentById(ResourceTable.Id_multiplication);
        Text division = (Text) findComponentById(ResourceTable.Id_multiplication);
        Text equal = (Text) findComponentById(ResourceTable.Id_egal);
        Text result = (Text) findComponentById(ResourceTable.Id_result);
        findComponentById(ResourceTable.Id_clear).setClickedListener(component -> {
            result.setText("");
            inputOutput.setText("");
        });




        findComponentById(ResourceTable.Id_deux).setClickedListener(component -> {
            int two = Integer.parseInt(((Text) component).getText());
            inputOutput.setText(two);
        });
        findComponentById(ResourceTable.Id_un).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_trois).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_quatre).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_cinq).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_six).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_sept).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_huit).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));
        findComponentById(ResourceTable.Id_neuf).setClickedListener(component -> inputOutput.setText(((Text)component).getText()));

    }

    private double addition(int a, int b) {
        return a + b;
    };

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
//