package miguel;

import io.mateu.mdd.core.annotations.Action;
import io.mateu.mdd.core.app.AbstractAction;
import io.mateu.mdd.core.app.MDDOpenCRUDAction;
import io.mateu.mdd.core.app.SimpleMDDApplication;
import io.mateu.mdd.core.util.Helper;
import miguel.model.Mascota;

public class MyApp extends SimpleMDDApplication {


    @Action
    public String encriptar(String original) {
        return Helper.md5(original);
    }


    @Action
    public AbstractAction mascotas() {
        return new MDDOpenCRUDAction("Mis mascotas", Mascota.class);
    }


}