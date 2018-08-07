package de.hybris.training.storefront.controllers.pages.training;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.training.core.model.TrainingEmployeeModel;
import de.hybris.training.core.service.TrainingService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;





@Controller
public class NewTrainingPageController  extends AbstractSearchPageController {

    private static String PAGE_NAME = "trainingPage" ;
    private static String DETAIL_PAGE = "trainingDetailPage" ;

    @Resource(name = "trainingService")
    private TrainingService trainingService;


    @RequestMapping(value = "/Training/Employee", method = RequestMethod.GET)
    public String getpressList(@RequestParam(value = "pageid", required = false) final String pageid,
                               final Model model) throws CMSItemNotFoundException
    {

        int page;


        if (pageid == null)
        {
            page = 1;
        }
        else
        {
            final Integer valueOf = Integer.valueOf(pageid);
            page = valueOf;
        }


        final List<TrainingEmployeeModel> pressList = trainingService.getAllEmployee(page);
        model.addAttribute("pressList", pressList);
        model.addAttribute("pages", trainingService.getTotal());

        storeCmsPageInModel(model, getContentPageForLabelOrId(PAGE_NAME));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(PAGE_NAME));
        return getViewForPage(model);


    }


    @RequestMapping(value = "/Training/Employee/{id}", method = RequestMethod.GET)
    public String getpressDetail(@PathVariable("id") final String pressId, final Model model) throws CMSItemNotFoundException
    {
        final TrainingEmployeeModel pressDetail = trainingService.getEmployeeWithId(pressId);
        if (pressDetail != null)
        {
            model.addAttribute("press", pressDetail);
        }

        storeCmsPageInModel(model, getContentPageForLabelOrId(DETAIL_PAGE));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(DETAIL_PAGE));
        return getViewForPage(model);
    }








}
