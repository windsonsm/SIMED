package br.com.simed.main;

import br.com.simed.controller.modificaLayout;
import br.com.simed.view.JFramePrincipal;
import br.com.simed.view.JFrameLogin;

public class Run {

    public static void main(String[] args) {

        modificaLayout layout = new modificaLayout();
        layout.Set_Layout();

        JFrameLogin flogin = new JFrameLogin();
        flogin.setVisible(true);
        flogin.setLocationRelativeTo(null);

    }

}
