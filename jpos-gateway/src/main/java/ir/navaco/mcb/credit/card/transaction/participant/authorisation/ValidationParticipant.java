package ir.navaco.mcb.credit.card.transaction.participant.authorisation;

import ir.navaco.mcb.credit.card.parser.dto.IMessage;
import ir.navaco.mcb.credit.card.transaction.config.ContextConstant;
import org.jpos.iso.ISOMsg;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;

/**
 * The participant to validate 11XX messages type
 *
 * @author sa.gholizadeh <sa.gholizadeh@navaco.ir>
 * @author a.khatamidoost <alireza.khtm@gmail.com>
 */
public class ValidationParticipant implements TransactionParticipant{
    @Override
    public int prepare(long l, Serializable serializable) {
        Context ctx = (Context)serializable;
        //IMessage isoMsgDto = (IMessage) ctx.get(ContextConstant.REQUEST_DTO_KEY);
        //ISOMsg isoMsg = (ISOMsg)ctx.get(ContextConstant.REQUEST_KEY);

        return PREPARED|NO_JOIN;
    }

    @Override
    public void commit(long l, Serializable serializable) {

    }

    @Override
    public void abort(long l, Serializable serializable) {

    }
}