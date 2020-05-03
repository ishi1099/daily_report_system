package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String work_at_error = _validateWork_at(r.getWork_at());
        if(!work_at_error.equals("")) {
            errors.add(work_at_error);
        }

        String leave_at_error = _validateLeave_at(r.getLeave_at());
        if(!leave_at_error.equals("")) {
            errors.add(leave_at_error);
        }


        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";

    }
    private static String _validateWork_at(String work_at) {
       if(work_at == null || work_at.equals("")) {
          return "出勤時刻を入力してください。";
            }

        return "";
    }

    private static String _validateLeave_at(String leave_at) {
    if(leave_at == null || leave_at.equals("")) {
       return "退勤時刻を入力してください。";
         }

     return "";
    }

}