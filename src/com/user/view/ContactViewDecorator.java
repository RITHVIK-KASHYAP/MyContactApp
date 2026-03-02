package com.user.view;

public abstract class ContactViewDecorator implements ContactView {

    protected final ContactView wrapped;

    protected ContactViewDecorator(ContactView wrapped) {
        this.wrapped = wrapped;
    }
}
