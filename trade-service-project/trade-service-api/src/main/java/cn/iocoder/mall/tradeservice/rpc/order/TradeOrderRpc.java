package cn.iocoder.mall.tradeservice.rpc.order;

import cn.iocoder.common.framework.vo.CommonResult;
import cn.iocoder.common.framework.vo.PageResult;
import cn.iocoder.mall.tradeservice.rpc.order.dto.TradeOrderCreateReqDTO;
import cn.iocoder.mall.tradeservice.rpc.order.dto.TradeOrderPageReqDTO;
import cn.iocoder.mall.tradeservice.rpc.order.dto.TradeOrderRespDTO;

import java.util.Collection;

/**
 * 交易订单 Rpc 接口
 */
public interface TradeOrderRpc {

    /**
     * 创建交易订单
     *
     * @param createReqDTO 订单信息
     * @return 订单编号
     */
    CommonResult<Integer> createTradeOrder(TradeOrderCreateReqDTO createReqDTO);

    /**
     * 获得订单交易
     *
     * @param tradeOrderId 订单交易编号
     * @param fields 额外返回字段，可见 {@link cn.iocoder.mall.tradeservice.enums.order.TradeOrderDetailFieldEnum}
     * @return 订单交易
     */
    CommonResult<TradeOrderRespDTO> getTradeOrder(Integer tradeOrderId, Collection<String> fields);

    /**
     * 获得交易订单分页
     *
     * @param pageDTO 订单交易分页查询
     * @return 订单交易分页结果
     */
    CommonResult<PageResult<TradeOrderRespDTO>> pageTradeOrder(TradeOrderPageReqDTO pageDTO);



}