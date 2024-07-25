package ch0902AnonymousObject.problem03;

public class CheckBox {
    OnSelectListener listener;

    public static interface OnSelectListener {
        void onSelect();
    }

    public void setOnSelectListener(OnSelectListener listener) {
        this.listener = listener;
    }

    public void select() {
        listener.onSelect();
    }
}
