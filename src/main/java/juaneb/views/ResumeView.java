package juaneb.views;

import juaneb.controllers.ResumeController;
import juaneb.utils.YesNoDialog;

class ResumeView extends SubView {

    private static final String MESSAGE = "¿Queréis jugar otra";
    
    private YesNoDialog yesNoDialog;

    ResumeView(){
        super();
        this.yesNoDialog = new YesNoDialog();
    }

    void interact(ResumeController resumeController) {
        assert resumeController != null;
        if (this.yesNoDialog.read(ResumeView.MESSAGE))
            resumeController.reset();
        else
            resumeController.next();
    }

}
