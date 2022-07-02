package org.example.vo.answer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.AnswerStatus;
import org.example.vo.GenericVO;


@Getter
@Setter
public class AnswerVO extends GenericVO {
    private String body;

    private AnswerStatus status;

    @Builder(builderMethodName = "childBuilder")
    public AnswerVO(Long id, String body, AnswerStatus status) {
        super(id);
        this.body = body;
        this.status = status;
    }

    @Override
    public String toString() {
        return "AnswerVO{" +
                "body='" + body + '\'' +
                ", status=" + status +
                ", id=" + id +
                '}';
    }
}
