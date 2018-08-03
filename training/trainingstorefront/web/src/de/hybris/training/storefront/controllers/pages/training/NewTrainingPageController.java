package de.hybris.training.storefront.controllers.pages.training;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class NewTrainingPageController  extends AbstractSearchPageController {

    private static String PAGE_NAME = "trainingPage" ;


    @RequestMapping(value = "/training", method = RequestMethod.GET)
    public String getTraining(final Model model) throws CMSItemNotFoundException {
        //

        storeCmsPageInModel(model, getContentPageForLabelOrId(PAGE_NAME));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(PAGE_NAME));
        return getViewForPage(model);



    }



}
