package com.tiMorpheus.BasicOfJ2ee;

import javax.inject.Inject;

/**
 *  осуществляется
 *  внедрение управляемого компонента. На основании его типа контейнер
 *  знает, что должен внедрить компонент Message. Контейнер управляет только одним
 *  СDI-компонентом типа Message, так что это и есть внедряемый компонент.
 */
public class Service {

    @Inject
    private Message message;

    public void showMessage() {
        System.out.println(message.getMessage());
    }

}